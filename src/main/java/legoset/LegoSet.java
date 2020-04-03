package legoset;

import lombok.Data;
import javax.xml.bind.annotation.*;
import java.net.URL;
import java.util.List;
import java.util.Set;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(propOrder = {"name", "theme", "subtheme","year", "pieces","tags","minifigs","weight","url",})
@Data
public class LegoSet {
    private String name;
    private String theme;
    private String subtheme;
    private int pieces;
    @XmlAttribute
    private int number;
    private URL url;
    private int year;


    @XmlElementWrapper(name = "minifigs")
    @XmlElement(name = "minifig")
    private List<Minifig> minifigs;

    @XmlElementWrapper(name = "tags")
    @XmlElement(name = "tag")
    private Set<String> tags;

    private Weight weight;







}