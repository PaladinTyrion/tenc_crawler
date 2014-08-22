package cn.com.paladintyrion.common.util;

public class SearchBean {

	private int start;//开始
	private int count;//
	private String sql="";//查询记录
	private String countSql="";//统计
	private String orderSql="";//排序
	private String columnSql="";//指定列或聚合函数
	private String groupSql="";//分组
	public SearchBean() {
		// TODO Auto-generated constructor stub
	}
	
	public int getStart() {
		return start;
	}
	public void setStart(int start) {
		this.start = start;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	public String getSql() {
		return sql;
	}
	public void setSql(String sql) {
		this.sql = sql;
	}
	
	public String getCountSql() {
		return countSql;
	}
	public void setCountSql(String countSql) {
		this.countSql = countSql;
	}
	public String getOrderSql() {
		return orderSql;
	}
	public void setOrderSql(String orderSql) {
		this.orderSql = orderSql;
	}
	
	public String getColumnSql() {
		return columnSql;
	}
	public void setColumnSql(String columnSql) {
		this.columnSql = columnSql;
	}
	public String getGroupSql() {
		return groupSql;
	}
	public void setGroupSql(String groupSql) {
		this.groupSql = groupSql;
	}
	protected boolean isEmpty(Object obj){
		return obj==null||"".equals(obj)||"null".equals(obj);
	}
}
