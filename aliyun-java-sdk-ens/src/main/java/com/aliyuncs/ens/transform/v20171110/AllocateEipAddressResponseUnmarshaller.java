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

package com.aliyuncs.ens.transform.v20171110;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ens.model.v20171110.AllocateEipAddressResponse;
import com.aliyuncs.ens.model.v20171110.AllocateEipAddressResponse.EipAddress;
import com.aliyuncs.transform.UnmarshallerContext;


public class AllocateEipAddressResponseUnmarshaller {

	public static AllocateEipAddressResponse unmarshall(AllocateEipAddressResponse allocateEipAddressResponse, UnmarshallerContext _ctx) {
		
		allocateEipAddressResponse.setRequestId(_ctx.stringValue("AllocateEipAddressResponse.RequestId"));

		List<EipAddress> eipAddresses = new ArrayList<EipAddress>();
		for (int i = 0; i < _ctx.lengthValue("AllocateEipAddressResponse.EipAddresses.Length"); i++) {
			EipAddress eipAddress = new EipAddress();
			eipAddress.setEip(_ctx.stringValue("AllocateEipAddressResponse.EipAddresses["+ i +"].Eip"));

			eipAddresses.add(eipAddress);
		}
		allocateEipAddressResponse.setEipAddresses(eipAddresses);
	 
	 	return allocateEipAddressResponse;
	}
}