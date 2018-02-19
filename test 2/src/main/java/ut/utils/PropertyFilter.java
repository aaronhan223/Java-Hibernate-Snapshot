package ut.utils;

public class PropertyFilter {

	public enum MatchType {
		EQUAL, NE, LIKE, GE, GT, LE, LT, ISNULL, NOTNULL;
	}

	private String propertyName;
	private Object value;
	private MatchType matchType = MatchType.EQUAL;

	public PropertyFilter() {
	}

	public PropertyFilter(String propertyName, Object value, MatchType matchType) {
		this.propertyName = propertyName;
		this.value = value;
		this.matchType = matchType;
	}

	/**
	 */
	public String getPropertyName() {
		return propertyName;
	}

	/**
	 */
	public void setPropertyName(final String propertyName) {
		this.propertyName = propertyName;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(final Object value) {
		this.value = value;
	}

	public MatchType getMatchType() {
		return matchType;
	}

	public void setMatchType(final MatchType matchType) {
		this.matchType = matchType;
	}
}
