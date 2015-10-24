package com.wang.ResponsibilityChainPattern;

/**
 * 抽象处理者
 * 
 * @author HeJW
 * 
 */
public abstract class Handler {

	private Handler nextHandler;

	/**
	 * 每个处理者都必须对请求作出处理
	 * 
	 * @param request
	 *            请求
	 * @return 处理结果
	 */
	public final Response handleMessage(Request request) {

		Response response = null;
		if (this.getHandlerLevel().equals(request.getRequestLevel())) {
			response = this.echo(request);
		} else {
			if (this.nextHandler != null) {
				response = this.nextHandler.handleMessage(request);
			} else {
				// 没有处理者,业务自行处理...
			}
		}
		return response;
	}

	/**
	 * 设置下一个处理者是谁
	 * 
	 * @param nextHandler
	 *            下一个处理者
	 */
	public void setNext(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}

	/**
	 * 每个处理者的处理级别
	 * 
	 * @return 处理级别
	 */
	protected abstract Level getHandlerLevel();

	/**
	 * 每个处理者所能够处理的任务
	 * 
	 * @param request
	 * @return
	 */
	protected abstract Response echo(Request request);

}
