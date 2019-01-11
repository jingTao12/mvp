package com.ida.learnactionbar.retrofit;

import com.ida.learnactionbar.model.NewsDataBean;
import com.ida.learnactionbar.model.ResultBean;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetNews {



    /*
    * 采用get请求
    * */
    @GET("index?type=top&key=47ac9dcad443ae961e4fe27b0eb8ddf2")
    Call<ResultBean> getCall();
}
