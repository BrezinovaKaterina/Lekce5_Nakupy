import com.engeto.homework.Cart;
import com.engeto.homework.Category;
import com.engeto.homework.Item;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Cart shoppingCart = new Cart();
        shoppingCart.addItem
                (new Item("Pečivo", BigDecimal.valueOf(148.10), Category.FOOD));
        System.out.println(shoppingCart.get(0));
    }
}