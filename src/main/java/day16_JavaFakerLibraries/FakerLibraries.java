package day16_JavaFakerLibraries;

import com.github.javafaker.Faker;

public class FakerLibraries
{
    public static void main(String[] args)
    {
        //Java Faker libraries give you real time look like data
        Faker faker = new Faker();
        //using for loop to retrieve the record how many times we want
        for(int i =1; i<=3; i++){
        System.out.println(faker.name().firstName());}
        System.out.println(faker.name().lastName());
        System.out.println(faker.address().fullAddress());
        System.out.println(faker.address().cityName());
        System.out.println(faker.address().city());
        System.out.println(faker.address().country());
        System.out.println(faker.company().name());
        System.out.println(faker.company().logo());
        System.out.println(faker.business().creditCardNumber());
        System.out.println(faker.internet().emailAddress());
        System.out.println(faker.idNumber().ssnValid());
        System.out.println(faker.random().nextInt(20,50));
        System.out.println(faker.demographic().sex());


    }
}
