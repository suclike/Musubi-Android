/*
 * Copyright 2012 The Stanford MobiSocial Laboratory
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package mobisocial.musubi.obj.handler;

import mobisocial.musubi.feed.iface.DbEntryHandler;
import mobisocial.socialkit.SignedObj;
import mobisocial.socialkit.musubi.DbObj;
import android.content.Context;

public interface IObjHandler {
    public void afterDbInsertion(Context context, DbEntryHandler typeInfo, DbObj obj);
    /**
     * Return false to prevent the obj from being stored in the database.
     */
    public boolean handleObjFromNetwork(Context context, SignedObj obj);
}
