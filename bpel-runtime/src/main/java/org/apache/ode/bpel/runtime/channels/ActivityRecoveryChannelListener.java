/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
/*
 * SOURCE FILE GENERATATED BY JACOB CHANNEL CLASS GENERATOR
 * 
 *               !!! DO NOT EDIT !!!! 
 * 
 * Generated On  : Fri Apr 16 09:44:36 EDT 2010
 * For Interface : org.apache.ode.bpel.runtime.channels.ActivityRecovery
 */

package org.apache.ode.bpel.runtime.channels;

import org.apache.commons.logging.LogFactory;
import org.apache.commons.logging.Log;

/**
 * An auto-generated channel listener abstract class for the 
 * {@link org.apache.ode.bpel.runtime.channels.ActivityRecovery} channel type. 
 * @see org.apache.ode.bpel.runtime.channels.ActivityRecovery
 * @see org.apache.ode.bpel.runtime.channels.ActivityRecoveryChannel
 */
public abstract class ActivityRecoveryChannelListener
    extends org.apache.ode.jacob.ChannelListener<org.apache.ode.bpel.runtime.channels.ActivityRecoveryChannel>
    implements org.apache.ode.bpel.runtime.channels.ActivityRecovery
{

    private static final Log __log = LogFactory.getLog(org.apache.ode.bpel.runtime.channels.ActivityRecovery.class);

    protected Log log() { return __log; } 

    protected ActivityRecoveryChannelListener(org.apache.ode.bpel.runtime.channels.ActivityRecoveryChannel channel) {
       super(channel);
    }
}
