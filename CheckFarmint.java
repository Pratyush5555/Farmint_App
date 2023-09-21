import FarmintAll.*;

public class CheckFarmint {
    public static void main(String[] args) {

        Dairy d = new Dairy();
        d.setMilk("Milk name");
        d.setMilkPrice(25);
        d.setMilkQuantity(30);
        System.out.println(d.getMilk());
        System.out.println(d.getMilkPrice());
        System.out.println(d.getMilkQuantity());

        d.setCurd("Curd name");
        d.setCurdPrice(24);
        d.setCurdQuantity(15);
        System.out.println(d.getCurd());
        System.out.println(d.getCurdPrice());
        System.out.println(d.getCurdQuantity());

        d.setGhee("Ghee");
        d.setGheePrice(70);
        d.setGheeQuantity(24);
        System.out.println(d.getGhee());
        System.out.println(d.getGheePrice());
        System.out.println(d.getGheeQuantity());

        d.setButter("Butter");
        d.setButterPrice(50);
        d.setButterQuantity(24);
        System.out.println(d.getButter());
        System.out.println(d.getButterPrice());
        System.out.println(d.getButterQuantity());

        d.setLassi("Lassi");
        d.setLassiPrice(15);
        d.setLassiQuantity(30);
        System.out.println(d.getLassi());
        System.out.println(d.getLassiPrice());
        System.out.println(d.getLassiQuantity());

        DailyNeed dn = new DailyNeed();
        dn.setVegitableAndFruits("Types of Vegitable and Fruits");
        dn.setVegAndFruitsPrice(100);
        System.out.println(dn.getVegitableAndFruits());
        System.out.println(dn.getVegAndFruitsPrice());

        dn.setGroceries("What you need ?");
        dn.setGrocPrice(50);
        System.out.println(dn.getGroceries());
        System.out.println(dn.getGrocPrice());

        dn.setMeatAndFish("Select non-veg items");
        dn.setMeatAndFishPrice(150);
        System.out.println(dn.getMeatAndFish());
        System.out.println(dn.getMeatAndFishPrice());

        Payment pay = new Payment();
        pay.setCod("Cash on delevery");
        System.out.println(pay.getCod());

        pay.setCard("Payment of which Card");
        System.out.println(pay.getCard());

        pay.setUpi("Online payment");
        System.out.println(pay.getUpi());

        Riders rd = new Riders();
        rd.setSmallRiders("short distance riders");
        System.out.println(rd.getSmallRiders());

        rd.setDistanceriders("Long distance riders");
        System.out.println(rd.getDistanceriders());

        rd.setDairyRiders("Deliver only dairy product");
        System.out.println(rd.getDairyRiders());

        rd.setDailyNeedRider("Daily need");
        System.out.println(rd.getDailyNeedRider());

        FarmintApp farm = new FarmintApp();
        farm.setSeller("Name of the Sellers");
        farm.setBuyer("Nmae of the Customer");
        farm.setRiders("Name of the Rider");
        farm.setAllCategory("What you need in this App?");
        System.out.println(farm.getSeller());
        System.out.println(farm.getBuyer());
        System.out.println(farm.getRiders());
        System.out.println(farm.getAllCategory());

        SignUp sign = new SignUp();
        sign.setName("Enter your name");
        sign.setEmail("Enter your email");
        sign.setMobile("Enter your mobile number");
        sign.setAge("Enter your age");
        sign.setCountry("Enter your country name");
        sign.setDistrict("Enter your district name");
        sign.setPin("Enter your pin");
        sign.setArea("Enter your area location");

        System.out.println(sign.getName());
        System.out.println(sign.getEmail());
        System.out.println(sign.getMobile());
        System.out.println(sign.getAge());
        System.out.println(sign.getCountry());
        System.out.println(sign.getDistrict());
        System.out.println(sign.getPin());
        System.out.println(sign.getArea());

    }
}