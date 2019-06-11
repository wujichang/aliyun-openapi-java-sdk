/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.bssopenapi.transform.v20171214;

import com.aliyuncs.bssopenapi.model.v20171214.SetResellerUserAlarmThresholdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class SetResellerUserAlarmThresholdResponseUnmarshaller {

	public static SetResellerUserAlarmThresholdResponse unmarshall(SetResellerUserAlarmThresholdResponse setResellerUserAlarmThresholdResponse, UnmarshallerContext context) {
		
		setResellerUserAlarmThresholdResponse.setRequestId(context.stringValue("SetResellerUserAlarmThresholdResponse.RequestId"));
		setResellerUserAlarmThresholdResponse.setCode(context.stringValue("SetResellerUserAlarmThresholdResponse.Code"));
		setResellerUserAlarmThresholdResponse.setMessage(context.stringValue("SetResellerUserAlarmThresholdResponse.Message"));
		setResellerUserAlarmThresholdResponse.setSuccess(context.booleanValue("SetResellerUserAlarmThresholdResponse.Success"));
		setResellerUserAlarmThresholdResponse.setData(context.booleanValue("SetResellerUserAlarmThresholdResponse.Data"));
	 
	 	return setResellerUserAlarmThresholdResponse;
	}
}