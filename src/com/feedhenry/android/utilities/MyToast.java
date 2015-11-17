/**
 * Copyright 2015 Red Hat, Inc., and individual contributors
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
package com.feedhenry.android.utilities;

import android.widget.Toast;

import com.feedhenry.android.MyApplication;

public class MyToast {
    public static void showToast(String text){
        Toast toast=Toast.makeText(MyApplication.getAppContext(),text,Toast.LENGTH_SHORT);
        toast.show();
    }
}
