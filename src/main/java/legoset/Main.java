package legoset;

import jaxb.JAXBHelper;

import java.io.FileOutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Set;

public class Main {

    public static void main(String[] args) throws Exception {
        LegoSet legoset = new LegoSet();
        legoset.setName("Imperial TIe Fighter");
        legoset.setTheme("Star Wars");
        legoset.setYear(2018);
        legoset.setPieces(519);
        legoset.setUrl(new URL("https://www.brickset.com/sets/75211-1/Imperial-TIE-Fighter"));
        legoset.setNumber(75211);

        ArrayList<Minifig> minifigs = new ArrayList<>();
        minifigs.add(new Minifig("Imperial Mudtrooper", 2));
        minifigs.add(new Minifig("Imperial Pilot", 1));
        minifigs.add(new Minifig("Mimban Stormtrooper", 1));
        legoset.setMinifigs(minifigs);

        legoset.setTags(Set.of("Starfighter", "Stormtrooper", "Star Wars","Solo"));
        legoset.setWeight(new Weight("kg",89));
        JAXBHelper.toXML(legoset, System.out);

        JAXBHelper.toXML(legoset, new FileOutputStream("legoset.xml"));

    }

}

