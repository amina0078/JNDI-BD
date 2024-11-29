import javax.naming.Context;
import javax.naming.InitialContext;
import java.util.Properties;

public class JNDIDNSExample {
    public static void main(String[] args) {
    	try {
            Properties props = new Properties();
            props.put(Context.INITIAL_CONTEXT_FACTORY, "org.apache.naming.java.javaURLContextFactory");
            props.put(Context.PROVIDER_URL, "java:comp/env");

            Context ctx = new InitialContext(props);
            Object resource = ctx.lookup("jdbc/MyDataSource");

            System.out.println("Ressource JNDI trouvée : " + resource);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
