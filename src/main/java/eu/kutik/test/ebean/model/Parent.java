package eu.kutik.test.ebean.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Parent {

  @Id
  private Integer id;

  private String name;

  @OneToMany(mappedBy = "parent", cascade = CascadeType.ALL)
  private final List<Child> children = new ArrayList<Child>();

  public Parent() {

  }

  public Parent(String name) {
    this.name = name;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<Child> getChildren() {
    return children;
  }

  public void addChild(Child child) {
    children.add(child);
  }

  @Override
  public String toString() {
    return "Parent[name=" + name + ",#children" + children.size() + "]";
  }
}
