package case_study_module4.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "service_type")
public class ServiceType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer service_type_id;
    private String service_type_name;

    @OneToMany(mappedBy = "serviceType")
    private List<Service> services;

    public ServiceType(Integer service_type_id, String service_type_name, List<Service> services) {
        this.service_type_id = service_type_id;
        this.service_type_name = service_type_name;
        this.services = services;
    }

    public List<Service> getServices() {
        return services;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public ServiceType() {
    }

    public Integer getService_type_id() {
        return service_type_id;
    }

    public void setService_type_id(Integer service_type_id) {
        this.service_type_id = service_type_id;
    }

    public String getService_type_name() {
        return service_type_name;
    }

    public void setService_type_name(String service_type_name) {
        this.service_type_name = service_type_name;
    }
}
