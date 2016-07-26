package eu.kutik.test.ebean.model;

import javax.persistence.*;

@Entity
public class Child {

  @Id
  @Column(name = "id")
  private Integer id;

  private String name;

  @ManyToOne
  @JoinColumn(name = "parent_id", referencedColumnName = "id")
  private Parent parent;

  public Child() {

  }

  public Child(String name) {
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

  public Parent getParent() {
    return parent;
  }

  public void setParent(Parent parent) {
    this.parent = parent;
  }

  @Override
  public String toString() {
    return "Child[name" + name + ",parent" + parent + "]";
  }
}
