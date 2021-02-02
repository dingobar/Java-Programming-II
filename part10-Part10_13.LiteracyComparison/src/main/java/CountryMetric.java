
public class CountryMetric implements Comparable<CountryMetric> {

	private final String metric;
	private final String sampleCategory;
	private final String subSampleCategory;
	private final String country;
	private final int year;
	private final double value;

	public CountryMetric(String metric, String sampleCategory, String subSampleCategory, String country, int year, double value) {
		this.metric = metric;
		this.sampleCategory = sampleCategory;
		this.subSampleCategory = subSampleCategory;
		this.country = country;
		this.year = year;
		this.value = value;
	}

	public String getMetric() {
		return metric;
	}

	public String getSampleCategory() {
		return sampleCategory;
	}

	public String getSubSampleCategory() {
		return subSampleCategory;
	}

	public String getCountry() {
		return country;
	}

	public int getYear() {
		return year;
	}

	public double getValue() {
		return value;
	}

	@Override
	public String toString() {
		return country + " (" + year + "), " + subSampleCategory.trim().split(" ")[0] + ", " + value;
	}

	@Override
	public int compareTo(CountryMetric other) {
		if (other.getValue() == value) {
			return 0;
		} else {
			return other.getValue() > value ? -1 : 1;
		}
	}

}
