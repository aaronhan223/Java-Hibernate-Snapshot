package ut.utils;

import java.util.Collections;
import java.util.List;

import org.apache.commons.lang.StringUtils;

public class Page<T> {

	public static final String ASC = "asc";
	public static final String DESC = "desc";

	public static final int MIN_PAGESIZE = 1;
	public static final int MAX_PAGESIZE = Integer.MAX_VALUE;

	protected int pageNo = 1;
	protected int pageSize = MIN_PAGESIZE;
	protected String orderBy = null;
	protected String order = ASC;
	protected boolean autoCount = true;

	protected List<T> result = null;
	protected int totalCount = -1;

	public Page() {
		super();
	}

	public Page(final int pageSize) {
		setPageSize(pageSize);
	}

	public Page(final int pageSize, final boolean autoCount) {
		setPageSize(pageSize);
		this.autoCount = autoCount;
	}

	public int getPageNo() {
		return pageNo;
	}

	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;

		if (pageNo < 1) {
			this.pageNo = 1;
		}
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(final int pageSize) {
		this.pageSize = pageSize;

		if (pageSize < MIN_PAGESIZE) {
			this.pageSize = MIN_PAGESIZE;
		}
		if (pageSize > MAX_PAGESIZE) {
			this.pageSize = MAX_PAGESIZE;
		}
	}

	public int getFirst() {
		return ((pageNo - 1) * pageSize);
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(final String orderBy) {
		this.orderBy = orderBy;
	}

	public boolean isOrderBySetted() {
		return StringUtils.isNotBlank(orderBy);
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(final String order) {

		String[] orders = StringUtils.split(order, ',');
		for (String orderStr : orders) {
			if (!StringUtils.equalsIgnoreCase(DESC, orderStr) && !StringUtils.equalsIgnoreCase(ASC, orderStr))
				throw new IllegalArgumentException("Illegal input: " + orderStr);
		}

		this.order = order.toLowerCase();
	}

	public String getPageRequest() {
		return getPageNo() + "|" + StringUtils.defaultString(getOrderBy()) + "|" + getOrder();
	}

	public void setPageRequest(final String pageRequest) {

		if (StringUtils.isBlank(pageRequest))
			return;

		String[] params = StringUtils.splitPreserveAllTokens(pageRequest, '|');

		if (StringUtils.isNumeric(params[0])) {
			setPageNo(Integer.valueOf(params[0]));
		}

		if (StringUtils.isNotBlank(params[1])) {
			setOrderBy(params[1]);
		}

		if (StringUtils.isNotBlank(params[2])) {
			setOrder(params[2]);
		}
	}

	public boolean isAutoCount() {
		return autoCount;
	}

	public void setAutoCount(final boolean autoCount) {
		this.autoCount = autoCount;
	}

	public List<T> getResult() {
		if (result == null)
			return Collections.emptyList();
		return result;
	}

	public void setResult(final List<T> result) {
		this.result = result;
	}

	public int getTotalCount() {
		return totalCount;
	}

	public void setTotalCount(final int totalCount) {
		this.totalCount = totalCount;
	}

	public int getTotalPages() {
		if (totalCount < 0)
			return -1;

		int count = totalCount / pageSize;
		if (totalCount % pageSize > 0) {
			count++;
		}
		return count;
	}

	public boolean isHasNext() {
		return (pageNo + 1 <= getTotalPages());
	}

	public int getNextPage() {
		if (isHasNext())
			return pageNo + 1;
		else
			return pageNo;
	}

	public boolean isHasPre() {
		return (pageNo - 1 >= 1);
	}

	public int getPrePage() {
		if (isHasPre())
			return pageNo - 1;
		else
			return pageNo;
	}

	public String getInverseOrder() {
		String[] orders = StringUtils.split(order, ',');

		for (int i = 0; i < orders.length; i++) {
			if (DESC.equals(orders[i])) {
				orders[i] = ASC;
			} else {
				orders[i] = DESC;
			}
		}
		return StringUtils.join(orders);
	}

	public int getPageOffset() {
		return (pageNo - 1) * pageSize;
	}
}
