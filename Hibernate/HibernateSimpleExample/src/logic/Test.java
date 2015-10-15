package logic;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="Test")
public class Test {
    
    private Long tid;   
    private String tname;   
    
    private Statistics stat;
        
    public Test(){
        tname = null;
    }
    
    public Test(Test s){
        tname = s.getTName();
    }
    
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="tid")
    public Long getTid() {
        return tid;
    }
    
    @Column(name="tname")
    public String getTName(){
        return tname;
    }
    
    public void setId(Long i){
        tid = i;        
    }
    
    public void setTName(String s){
        tname = s;
    }

    @ManyToOne
    @JoinTable(name="id")
	public Statistics getStat() {
		return stat;
	}       
    
    private Student stud;

    @ManyToOne
    @JoinTable(name="Statistics", joinColumns=@JoinColumn(name="tid"),
    	inverseJoinColumns=@JoinColumn(name="id"))
	public Student getStud() {
		return stud;
	}
    
    
}