package jp.water_cell.java.rxsample.collections;

import java.util.List;
import java.util.Set;

import jp.water_cell.java.rxsample.collections.models.City;
import jp.water_cell.java.rxsample.collections.models.Customer;
import jp.water_cell.java.rxsample.collections.models.Shop;
import rx.Observable;

public class A_FilterMap implements ICollectionUtils {

    void example0(List<Integer> list) {
        Integer positiveNumbers = Observable.from(list).filter(integer -> integer > 0).toBlocking().single();
        Integer squares = Observable.from(list).map(integer -> integer * integer).toBlocking().single();
    }

    public Set<City> getCitiesCustomersAreFrom(Shop shop) {
        // Return the set of cities the customers are from
        // TODO
        return null;
    }


    public List<Customer> getCustomersFrom(Shop shop, City city) {
        // Return the list of the customers who live in the given city
        // TODO
        return null;
    }
}
