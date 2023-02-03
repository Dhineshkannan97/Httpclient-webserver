import com.client.HttpClientStatus;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        HttpClientStatus status = new HttpClientStatus();
        int numRequests = 100; // adjust this value as needed
        for (int i = 0; i < numRequests; i++) {
            status.getMethod();
        }


    }
}
