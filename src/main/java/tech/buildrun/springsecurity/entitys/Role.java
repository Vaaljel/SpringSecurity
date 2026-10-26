package tech.buildrun.springsecurity.entitys;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tb_roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private Long  roleId;

    private String name;

    public enum Values{
        ADMIN(1L),
        BASIC(2L);

        Long roleId;

        Values(Long roleId){
            this.roleId = roleId;
        }

        public Long getRoleId(){
            return roleId;
        }
    }
}
