package count.thinkxfactor.zomatoplus.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_items")
public class item {
	@Id
	@GeneratedValue//default generation strategy
	@Column(name="item_id")
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price")
	private String price;
	
	@Column(name="description")
	private String description;

	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}


	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}


	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}


	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}


	/**
	 * @return the price
	 */
	public String getPrice() {
		return price;
	}


	/**
	 * @param price the price to set
	 */
	public void setPrice(String price) {
		this.price = price;
	}


	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}


	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}


	public item()
	{
	}
	}
	
