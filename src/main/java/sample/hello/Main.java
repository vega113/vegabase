package sample.hello;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.CouchbaseCluster;
import com.couchbase.client.java.document.JsonDocument;
import com.couchbase.client.java.document.json.JsonObject;

public class Main {

	public static void main(String[] args) {
		try {
			testCouch();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void testCouch() throws InterruptedException {
		JsonObject content = JsonObject.create().put("hello", "world");
		CouchbaseCluster cluster = CouchbaseCluster.create("127.0.0.1");
		// Connect to the bucket and open it
		Bucket bucket = cluster.openBucket("default");

		bucket.remove("helloworld");
		bucket.async()
				.insert(JsonDocument.create("helloworld", content))
				.flatMap(document -> bucket.async().get(document))
				.map(doc -> doc.content())
				.subscribe(
						s -> System.out
								.println("Couchbase is the best database in the "
										+ s));

		Thread.sleep(1000);
	}
}
