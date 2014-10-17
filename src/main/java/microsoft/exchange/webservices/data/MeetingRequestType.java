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
 * Defines the type of a meeting request.
 */
public enum MeetingRequestType {

	// Undefined meeting request type.
	/** The None. */
	None,

	// The meeting request is an update to the original meeting.
	/** The Full update. */
	FullUpdate,

	// The meeting request is an information update.
	/** The Informational update. */
	InformationalUpdate,

	// The meeting request is for a new meeting.
	/** The New meeting request. */
	NewMeetingRequest,

	// The meeting request is outdated.
	/** The Outdated. */
	Outdated,

	// The meeting update is a silent update to an existing meeting.
	/** The Silent update. */
	SilentUpdate,

	// The meeting update was forwarded to a delegate, and this copy is
	// informational.
	/** The Principal wants copy. */
	PrincipalWantsCopy

}