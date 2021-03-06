package com.delicious.delicious.ui.restaurants;

import com.delicious.delicious.base.presenter.BasePresenter;
import com.delicious.delicious.base.presenter.BaseView;
import com.delicious.delicious.data.Restaurant;
import com.delicious.delicious.ui.restaurants.adpater.RestaurantsAdapterContract;

public interface RestaurantContract {

    interface View extends BaseView<Presenter> {

        void showShops();

        void showLoadFailure();

        void showRestaurantDetail(Restaurant restaurant);
    }

    interface Presenter extends BasePresenter {

        void setAdapterView(RestaurantsAdapterContract.Model adapterModel);

        void loadRestaurants(String location, String sort);

        boolean hasMoreNext();

        boolean isLoading();

        void goRestaurantDetail(int position);
    }
}
