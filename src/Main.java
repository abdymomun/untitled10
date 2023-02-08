import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //TODO Sadyr joporov
        Country country = new Country("Кыргызстан ",6000000,"Садыр Жапаров");
        Country country1 = new Country("кореа ",500000000,"Ким чон");
        Country country2 = new Country("Америка ",900000000,"John Bayden");

        Country []countrys={country ,country1, country2};
        for (Country a:countrys) {
            System.out.println("\nМенин олком "+a.getName()+"\nолконун калкы "+a.getPopulation()+"\nОлконун президенти"+a.getPresident());
        }

        Addres addres = new Addres("7 Апрель","Кок - Жар","Бишкек");
        Addres addres1 = new Addres("Ош обласьы","Чон - Алай","Кара-Мык");
        Addres addres2 = new Addres("Амерка","woolstreet","New York");
        Addres []addres3 = {addres,addres1,addres2};
        for (Addres b: addres3) {
            System.out.println("\nМен жашаган жер "+b.getStreet()+"\n "+b.getName()+"\nГород "+b.getCity());
        }
        Person percon = new Person("Абдымомун",17,"M",56);
        Person percon1 = new Person("Руслан ",20,"M",63);
        Person percon2 = new Person("Матмуса",21,"M",64);
        Person[] person3 = {percon,percon1,percon2};
        for (Person c: person3) {
            System.out.println("\nМенин атым "+c.getName()+"\nЖашым "+c.getAge()+"\nЖынысым "+c.getGender()+"\nCалмагым "+c.getWeight());
        }
        City city = new City("Кыргызстан ","Бишкекте ",1500000);
        City city1 = new City("Ош область ","Кара-мыкта ",2500);
        City city2 = new City("Америка ","New Yorkто ",60000000);
        City [] city3 = {city,city1,city2};
        for (City v: city3) {
            System.out.println("\n Мамлекет "+v.getName()+"\n Жашоо "+v.getLife()+"\nКалкы "+v.getPopulation());
        }



        

        //TODO student 5
      /* Student student = new Student("abdymomun", LocalDate.of(2005,07,15),"0220514717","kyrgyz");
        Student student1 = new Student("ruslan", LocalDate.of(2002,04,12),"0505120402","kyrgyz");
        Student student2 = new Student("matmusa", LocalDate.of(2001,10,12),"07771707жон жети","kyrgyz");
        Student student3 = new Student("baktiar", LocalDate.of(2003,06,20),"022200000","kyrgyz");
        Student student4 = new Student("adam", LocalDate.of(1,1,1),"0000000000","adam");

        Student[]counture={student,student1,student2,student3,student4};
        for (Student a:counture
             ) {
            System.out.println("my name is "+a.getName()+"\n"+
                    "==================================="+"\n"+
                    "my old year " +a.getDateOfBirth()+"\n"+
                    "==================================="+"\n"+
                    "my phone number "+a.getPhoneNumber()+"\n"+
                    "==================================="+"\n"+
                    "my nationaly "+a.getNationality());
        }
    }
}

       */
        //TODO pro max
     /*   Phone phone1 = new Phone("Apple", "iPhone 12 pro", 999.99);
        Phone phone2 = new Phone("Samsung", "Galaxy S22", 899.99);

        phone1.setScreen("6.1-inch OLED");
        phone1.setMemory(1028);

        phone2.setScreen("6.2-inch OLED");
        phone2.setMemory(512);

        System.out.println("Phone 1: " + phone1.getBrand() + " " + phone1.getVersion() + " with " +
                phone1.getScreen() + " and " + phone1.getMemory() + "GB memory for $" +
                phone1.getPrice());
        System.out.println("Phone 2: " + phone2.getBrand() + " " + phone2.getVersion() + " with " +
                phone2.getScreen() + " and " + phone2.getMemory() + "GB memory for $" +
                phone2.getPrice());
    }
}

      */
        /*Personn[] people = new Personn[5];

        Phone phone = new Phone("Appla", "iphone xs", 25000);
        Phone phone1 = new Phone("Xiaomi", "redmi 11 T", 32000);
        Phone phone2 = new Phone("xiaomi", "siaomi 4", 4999);
        Phone phone3 = new Phone("Apple", "iphone", 25000);
        Phone phone4 = new Phone("Apple", "iphone", 120000);

        people[0] = new Personn("Abdymomun", 32, "programmer", 5000, phone);
        people[1] = new Personn("Ruslan", 28, "programmer", 7000, phone1);
        people[2] = new Personn("Matmusa", 35, "programmer", 6000, phone2);
        people[3] = new Personn("Baktiar", 30, "programmer", 8000, phone3);
        people[4] = new Personn("Manas", 27, "programmer", 2000,phone4);

        Phone [] phones={phone,phone1,phone2,phone3,phone4};
        Personn max = people[0];
        for (Personn personn : people) {
            if (personn.getSalary() > max.getSalary()) {
                max = personn;
            }
        }
        System.out.println(max);
        for (Personn person : people) {
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());
            System.out.println("Work: " + person.getWork());
            System.out.println("Salary: " + person.getSalary());
            System.out.println("Phone: " + person.getPhone().getPrice());
            System.out.println();
        }
        Personn highestPaidPerson = people[0];

        for (Personn person : people) {
            if (person.getSalary() > highestPaidPerson.getSalary()) {
                highestPaidPerson = person;
            }
        }

        System.out.println("с выскокой оплатой : " + highestPaidPerson.getName());
        Personn lowestPaidPerson = people[0];

        for (Personn person : people) {
            if (person.getSalary() < lowestPaidPerson.getSalary()) {
                lowestPaidPerson = person;
            }
        }

        System.out.println("с низким оплатом: " + lowestPaidPerson.getName());



       /* Phone phone1 = new Phone("Apple", "iPhone 12 pro", 999.99);
        Phone phone2 = new Phone("Samsung", "Galaxy S22", 690.99);
        Phone phone3 = new Phone("Samsung", "Galaxy S22", 499.99);
        Phone phone4 = new Phone("Samsung", "Galaxy S22", 820.99);
        Phone phone5 = new Phone("Samsung", "Galaxy S22", 120.99);

        phone1.setScreen("6.1-inch OLED");
        phone1.setMemory(1028);

        phone2.setScreen("6.2-inch OLED");
        phone2.setMemory(512);

        System.out.println("Phone 1: " + phone1.getBrand() + " " + phone1.getVersion() + " with " +
                phone1.getScreen() + " and " + phone1.getMemory() + "GB memory for $" +
                phone1.getPrice());
        System.out.println("Phone 2: " + phone2.getBrand() + " " + phone2.getVersion() + " with " +
                phone2.getScreen() + " and " + phone2.getMemory() + "GB memory for $" +
                phone2.getPrice());

        */
    }
}
