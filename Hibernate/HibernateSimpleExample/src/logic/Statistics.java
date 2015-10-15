package logic;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.stringtemplate.v4.compiler.CodeGenerator.region_return;

@Entity
@Table(name="Statistics")
public class Statistics {   
    
    private Long stid;  
    private Long id;    
    private Long tid;
    
    private Set<Student> students = new HashSet<Student>(0);
    private Set<Test> tests = new HashSet<Test>(0);
        
    public Statistics(){        
    }
        
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="stid")
    public Long getStid(){
        return stid;
    }
    
    @Column(name="id")
    public Long getId(){
        return id;
    }
    
    @Column(name="tid")
    public Long getTid(){
        return tid;
    }

    @OneToMany
    @JoinTable(name="id")
	public Set<Student> getStudents(Set<Student> students) {
		return students;
	}

    @OneToMany
    @JoinTable(name="id")
	public Set<Test> getTests(Set<Test> tests) {
		return tests;
	}
    
    
}
