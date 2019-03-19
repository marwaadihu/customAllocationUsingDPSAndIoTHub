package in.marwaadihu;

public class ResponseObjectForDps {

	public String iotHubHostName;
	public String IoTHub;
	public DeviceTwinObj initialTwin;
	public String[] linkedHubs;
	public String enrollment;

	/**
	 * @return the iotHubHostName
	 */
	public String getIotHubHostName() {
		return iotHubHostName;
	}

	/**
	 * @param iotHubHostName the iotHubHostName to set
	 */
	public void setIotHubHostName(String iotHubHostName) {
		this.iotHubHostName = iotHubHostName;
	}

	/**
	 * @return the ioTHub
	 */
	public String getIoTHub() {
		return IoTHub;
	}

	/**
	 * @param ioTHub the ioTHub to set
	 */
	public void setIoTHub(String ioTHub) {
		IoTHub = ioTHub;
	}

	/**
	 * @return the initialTwin
	 */
	public DeviceTwinObj getInitialTwin() {
		return initialTwin;
	}

	/**
	 * @param initialTwin the initialTwin to set
	 */
	public void setInitialTwin(DeviceTwinObj initialTwin) {
		this.initialTwin = initialTwin;
	}

	/**
	 * @return the linkedHubs
	 */
	public String[] getLinkedHubs() {
		return linkedHubs;
	}

	/**
	 * @param linkedHubs the linkedHubs to set
	 */
	public void setLinkedHubs(String[] linkedHubs) {
		this.linkedHubs = linkedHubs;
	}

	/**
	 * @return the enrollment
	 */
	public String getEnrollment() {
		return enrollment;
	}

	/**
	 * @param enrollment the enrollment to set
	 */
	public void setEnrollment(String enrollment) {
		this.enrollment = enrollment;
	}

}
