package case_study_module4.model;

import javax.persistence.*;

@Entity
@Table(name = "contract_detail")
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer contract_detail_id;
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "attach_service_id", nullable = false)
    private AttachService attach_service;

    @ManyToOne
    @JoinColumn(name = "contract_id", nullable = false)
    private Contract contract;

    public ContractDetail(Integer contract_detail_id, Integer quantity, AttachService attach_service, Contract contract) {
        this.contract_detail_id = contract_detail_id;
        this.quantity = quantity;
        this.attach_service = attach_service;
        this.contract = contract;
    }

    public ContractDetail() {
    }

    public AttachService getAttach_service() {
        return attach_service;
    }

    public void setAttach_service(AttachService attach_service) {
        this.attach_service = attach_service;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public Integer getContract_detail_id() {
        return contract_detail_id;
    }

    public void setContract_detail_id(Integer contract_detail_id) {
        this.contract_detail_id = contract_detail_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
