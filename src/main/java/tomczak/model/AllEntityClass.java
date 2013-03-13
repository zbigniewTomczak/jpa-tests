package tomczak.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AllEntityClass {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	private short short_;
	private int int_;
	private long long_;
	private float float_;
	private double double_;
	private char char_;
	private boolean boolean_;
	
	private Short bigShort_;
	private Integer bigInteger_;
	private Long bigLong_;
	private Float bigFloat_;
	private Double bigDouble_;
	private Character bigCharacter_;
	private Boolean bigBoolean_;
	
	private java.math.BigInteger bigInteger;
	private java.math.BigDecimal bigDecimal;
	
	private short[] short_array;
	private int[] int_array;
	private long[] long_array;
	private float[] float_array;
	private double[] double_array;
	private char[] char_array;
	private boolean[] boolean_array;
	
	
	private EmbeddableClass embeddableClass;
	private EmbeddableClass[] embeddableClassArray;
	private List<EmbeddableClass> embeddableClassList;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public short getShort_() {
		return short_;
	}
	public void setShort_(short short_) {
		this.short_ = short_;
	}
	public int getInt_() {
		return int_;
	}
	public void setInt_(int int_) {
		this.int_ = int_;
	}
	public long getLong_() {
		return long_;
	}
	public void setLong_(long long_) {
		this.long_ = long_;
	}
	public float getFloat_() {
		return float_;
	}
	public void setFloat_(float float_) {
		this.float_ = float_;
	}
	public double getDouble_() {
		return double_;
	}
	public void setDouble_(double double_) {
		this.double_ = double_;
	}
	public char getChar_() {
		return char_;
	}
	public void setChar_(char char_) {
		this.char_ = char_;
	}
	public boolean isBoolean_() {
		return boolean_;
	}
	public void setBoolean_(boolean boolean_) {
		this.boolean_ = boolean_;
	}
	public Short getBigShort_() {
		return bigShort_;
	}
	public void setBigShort_(Short bigShort_) {
		this.bigShort_ = bigShort_;
	}
	public Integer getBigInteger_() {
		return bigInteger_;
	}
	public void setBigInteger_(Integer bigInteger_) {
		this.bigInteger_ = bigInteger_;
	}
	public Long getBigLong_() {
		return bigLong_;
	}
	public void setBigLong_(Long bigLong_) {
		this.bigLong_ = bigLong_;
	}
	public Float getBigFloat_() {
		return bigFloat_;
	}
	public void setBigFloat_(Float bigFloat_) {
		this.bigFloat_ = bigFloat_;
	}
	public Double getBigDouble_() {
		return bigDouble_;
	}
	public void setBigDouble_(Double bigDouble_) {
		this.bigDouble_ = bigDouble_;
	}
	public Character getBigCharacter_() {
		return bigCharacter_;
	}
	public void setBigCharacter_(Character bigCharacter_) {
		this.bigCharacter_ = bigCharacter_;
	}
	public Boolean getBigBoolean_() {
		return bigBoolean_;
	}
	public void setBigBoolean_(Boolean bigBoolean_) {
		this.bigBoolean_ = bigBoolean_;
	}
	public java.math.BigInteger getBigInteger() {
		return bigInteger;
	}
	public void setBigInteger(java.math.BigInteger bigInteger) {
		this.bigInteger = bigInteger;
	}
	public java.math.BigDecimal getBigDecimal() {
		return bigDecimal;
	}
	public void setBigDecimal(java.math.BigDecimal bigDecimal) {
		this.bigDecimal = bigDecimal;
	}
	public short[] getShort_array() {
		return short_array;
	}
	public void setShort_array(short[] short_array) {
		this.short_array = short_array;
	}
	public int[] getInt_array() {
		return int_array;
	}
	public void setInt_array(int[] int_array) {
		this.int_array = int_array;
	}
	public long[] getLong_array() {
		return long_array;
	}
	public void setLong_array(long[] long_array) {
		this.long_array = long_array;
	}
	public float[] getFloat_array() {
		return float_array;
	}
	public void setFloat_array(float[] float_array) {
		this.float_array = float_array;
	}
	public double[] getDouble_array() {
		return double_array;
	}
	public void setDouble_array(double[] double_array) {
		this.double_array = double_array;
	}
	public char[] getChar_array() {
		return char_array;
	}
	public void setChar_array(char[] char_array) {
		this.char_array = char_array;
	}
	public boolean[] getBoolean_array() {
		return boolean_array;
	}
	public void setBoolean_array(boolean[] boolean_array) {
		this.boolean_array = boolean_array;
	}
	public EmbeddableClass getEmbeddableClass() {
		return embeddableClass;
	}
	public void setEmbeddableClass(EmbeddableClass embeddableClass) {
		this.embeddableClass = embeddableClass;
	}
	public List<EmbeddableClass> getEmbeddableClassList() {
		return embeddableClassList;
	}
	public void setEmbeddableClassList(List<EmbeddableClass> embeddableClassList) {
		this.embeddableClassList = embeddableClassList;
	}
	public EmbeddableClass[] getEmbeddableClassArray() {
		return embeddableClassArray;
	}
	public void setEmbeddableClassArray(EmbeddableClass[] embeddableClassArray) {
		this.embeddableClassArray = embeddableClassArray;
	}
	
	
	
}
