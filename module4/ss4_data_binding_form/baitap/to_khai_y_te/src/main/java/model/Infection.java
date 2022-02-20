package model;

public class Infection {
    private String infection1;
    private String infection2;

    public Infection(String infection1, String infection2) {
        this.infection1 = infection1;
        this.infection2 = infection2;
    }

    public Infection() {
    }

    public String getInfection1() {
        return infection1;
    }

    public void setInfection1(String infection1) {
        this.infection1 = infection1;
    }

    public String getInfection2() {
        return infection2;
    }

    public void setInfection2(String infection2) {
        this.infection2 = infection2;
    }
}
