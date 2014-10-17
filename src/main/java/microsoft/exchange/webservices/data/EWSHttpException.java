/**************************************************************************
 Exchange Web Services Java API
 Copyright (c) Microsoft Corporation
 All rights reserved.
 MIT License
 Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated documentation files (the ""Software""), to deal in the Software without restriction, including without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 The above copyright notice and this permission notice shall be included in all copies or substantial portions of the Software.
 THE SOFTWARE IS PROVIDED *AS IS*, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 **************************************************************************/

package microsoft.exchange.webservices.data;

/**
 * The Class EWSHttpException.
 */
public class EWSHttpException extends Exception {

	/**
	 * Instantiates a new eWS http exception.
	 */
	public EWSHttpException() {
		super();
		
	}

	/**
	 * Instantiates a new eWS http exception.
	 * 
	 * @param arg0
	 *            the arg0
	 * @param arg1
	 *            the arg1
	 */
	public EWSHttpException(String arg0, Throwable arg1) {
		super(arg0, arg1);
		
	}

	/**
	 * Instantiates a new eWS http exception.
	 * 
	 * @param arg0
	 *            the arg0
	 */
	public EWSHttpException(String arg0) {
		super(arg0);
	
	}

	/**
	 * Instantiates a new eWS http exception.
	 * 
	 * @param arg0
	 *            the arg0
	 */
	public EWSHttpException(Throwable arg0) {
		super(arg0);
	
	}

}