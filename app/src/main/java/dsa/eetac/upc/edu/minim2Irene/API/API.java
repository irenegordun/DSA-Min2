package dsa.eetac.upc.edu.minim2Irene.API;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Headers;
import retrofit2.http.Path;

public interface API {

    public static final String BASE_URL = "https://api.github.com/";

    @Headers({
            "Accept: application/json",
            "Content-Type: application/json"
    })
    @GET("users/{username}")
    Call<User> getInfoUser(@Path("username") String username);

    @GET("users/{username}/repos")
    Call<List<Repos>> getRepos(@Path("username") String username);
}
