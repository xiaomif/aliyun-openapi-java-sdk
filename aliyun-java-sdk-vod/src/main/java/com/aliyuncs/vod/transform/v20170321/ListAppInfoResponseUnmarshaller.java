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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.ListAppInfoResponse;
import com.aliyuncs.vod.model.v20170321.ListAppInfoResponse.AppInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAppInfoResponseUnmarshaller {

	public static ListAppInfoResponse unmarshall(ListAppInfoResponse listAppInfoResponse, UnmarshallerContext context) {
		
		listAppInfoResponse.setRequestId(context.stringValue("ListAppInfoResponse.RequestId"));

		List<AppInfo> appInfoList = new ArrayList<AppInfo>();
		for (int i = 0; i < context.lengthValue("ListAppInfoResponse.AppInfoList.Length"); i++) {
			AppInfo appInfo = new AppInfo();
			appInfo.setAppId(context.stringValue("ListAppInfoResponse.AppInfoList["+ i +"].AppId"));
			appInfo.setAppName(context.stringValue("ListAppInfoResponse.AppInfoList["+ i +"].AppName"));
			appInfo.setType(context.stringValue("ListAppInfoResponse.AppInfoList["+ i +"].Type"));
			appInfo.setDescription(context.stringValue("ListAppInfoResponse.AppInfoList["+ i +"].Description"));
			appInfo.setStatus(context.stringValue("ListAppInfoResponse.AppInfoList["+ i +"].Status"));
			appInfo.setCreationTime(context.stringValue("ListAppInfoResponse.AppInfoList["+ i +"].CreationTime"));
			appInfo.setModificationTime(context.stringValue("ListAppInfoResponse.AppInfoList["+ i +"].ModificationTime"));

			appInfoList.add(appInfo);
		}
		listAppInfoResponse.setAppInfoList(appInfoList);
	 
	 	return listAppInfoResponse;
	}
}