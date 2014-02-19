package us.tonym.cassandra_test;
import com.datastax.driver.core.*;
import com.datastax.driver.core.exceptions.*;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		Cluster cluster = new Cluster.Builder()
			.addContactPoint("127.0.0.1")
			.withSocketOptions(new SocketOptions().setTcpNoDelay(true))
			.build();

		Session session = cluster.connect();

		Metadata metadata = cluster.getMetadata();
		System.out.println("Connected to : " + metadata.getClusterName());
		for(KeyspaceMetadata ks: metadata.getKeyspaces()){
			System.out.println("Keyspace: " + ks.getName());
		}
		session.execute("use twissandra");
		for ( Iterator<Row> i  = session.execute("SELECT * FROM users").iterator();  i.hasNext();  ){
			Row row = i.next();
			System.out.println(row.getString("key"));
		 }
    }
}
