package se.west.shauqra;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "customerForSomeFoo", namespace = "http://acme.com/customer-api")
@XmlType(name = "someFoo", namespace = "http://acme.com/customer-api")
@XmlAccessorType(XmlAccessType.FIELD)
public class FooWithSuppliedXmlTypeName {
    @XmlElement(required = true, defaultValue = "defaultName")
    private String name;

    @XmlElement(required = true, namespace = "http://acme.com/customer-api")
    private String anotherName;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnotherName() {
        return anotherName;
    }

    public void setAnotherName(String name) {
        this.anotherName = name;
    }
}
