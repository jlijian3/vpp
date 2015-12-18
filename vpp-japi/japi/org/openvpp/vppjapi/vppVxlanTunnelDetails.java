/*
 * Copyright (c) 2015 Cisco and/or its affiliates.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.openvpp.vppjapi;

public class vppVxlanTunnelDetails {
    public int srcAddress;
    public int dstAddress;
    public int encapVrfId;
    public int vni;
    public int decap_next_index;

    public vppVxlanTunnelDetails(int _srcAddress, int _dstAddress,
            int _encapVrfId, int _vni, int _decap_next_index) {
        srcAddress = _srcAddress;
        dstAddress = _dstAddress;
        encapVrfId = _encapVrfId;
        vni = _vni;
        decap_next_index = _decap_next_index;
    }
}