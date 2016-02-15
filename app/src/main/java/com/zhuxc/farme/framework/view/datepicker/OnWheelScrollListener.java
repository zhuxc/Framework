package com.zhuxc.farme.framework.view.datepicker;


public interface OnWheelScrollListener {
	/**
	 * Callback method to be invoked when scrolling started.
	 * 
	 * @param wheel
	 *            the wheel view whose state has changed.
	 */
	void onScrollingStarted(WheelView wheel);

	/**
	 * Callback method to be invoked when scrolling ended.
	 * 
	 * @param wheel
	 *            the wheel view whose state has changed.
	 */
	void onScrollingFinished(WheelView wheel);
/**
 * 时间的
 * @param wheelViewTime
 */
	void onScrollingStarted(WheelViewTime wheelViewTime);

	void onScrollingFinished(WheelViewTime wheelViewTime);
}
