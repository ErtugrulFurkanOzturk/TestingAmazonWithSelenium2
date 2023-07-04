
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class Test_Add_Product_to_Card extends BaseAmazonTest{

    HomePage homePage ;
    ProductPage productPage ;
    ProductDetailPage productDetailPage ;
    CardPage cardPage ;

    @Test
    @Order(1)
    public void searchProduct(){
        homePage = new HomePage(driver);
        homePage.acceptCookies();
        productPage = new ProductPage(driver);
        homePage.searchBox().search("telefon");
        Assertions.assertTrue(productPage.isOnProductPage() , "Not on products page !!");
    }

    @Test
    @Order(2)
    public void selectProduct(){
        productDetailPage = new ProductDetailPage(driver);
        productPage.selectProduct(1);
        Assertions.assertTrue(productDetailPage.isOnProductDetailPage() , "Product count did not increase !!");
    }

    @Test
    @Order(3)
    public void addProductToCard(){
        productDetailPage.addToCard();
        Assertions.assertTrue(homePage.isProductCountUp() , "Not on products detail page !!");

    }

    @Test
    @Order(4)
    public void gotoCardPage(){
        cardPage = new CardPage(driver);
        homePage.goToCard();
        Assertions.assertTrue(cardPage.checkIfProductAdded() , "Product was not added to card !!");

    }

}

