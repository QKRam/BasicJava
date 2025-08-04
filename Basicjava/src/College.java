public class College
{
	private String clgName;
	private String clgAddress;
	private long clgMobNo;

	public College( String clgName,String clgAddress,long clgMobNo)
	{
	this.clgName=clgName;
	this.clgAddress=clgAddress;
	this.clgMobNo=clgMobNo;
	}
	
	public String getClgName()
	{
	return clgName;
	}
	
	public String getClgAddress()
	{
	return clgAddress;
	}
	
	public long getClgMobNo()
	{
	return clgMobNo;
	}
	
	
}