import java.io.IOException;
import java.net.MalformedURLException;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;

import com.ailiens.common.ApacheHttpClientInterceptor;

public class TestApacheHttpClientInterceptor {

	public static void main(String[] args) {
		try {
			@SuppressWarnings("resource")
			DefaultHttpClient httpClient = new DefaultHttpClient();
			HttpGet postRequest = new HttpGet(
					"http://private-03724-lmsapi4.apiary-mock.com/api/v1/bookings/delhivery/tracking");

			httpClient.addRequestInterceptor(new ApacheHttpClientInterceptor());
			HttpResponse response = httpClient.execute(postRequest);
			if (response.getStatusLine().getStatusCode() != 200) {
				throw new RuntimeException("Failed : HTTP error code : " + response.getStatusLine().getStatusCode());
			}
			httpClient.getConnectionManager().shutdown();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
