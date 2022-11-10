package java8newFeature.streamApi;

public class State {
	public String stateName;
	public Integer stateCode;

	public State(String stateName, Integer stateCode) {
		this.stateName = stateName;
		this.stateCode = stateCode;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	public Integer getStateCode() {
		return stateCode;
	}

	public void setStateCode(Integer stateCode) {
		this.stateCode = stateCode;
	}

	@Override
	public String toString() {
		return "State [stateName=" + stateName + ", stateCode=" + stateCode + "]";
	}

}
