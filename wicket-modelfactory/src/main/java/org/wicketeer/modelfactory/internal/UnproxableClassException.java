//
//
// Copyright 2012-2012 Uwe Schäfer <uwe@codesmell.de>
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
//

package org.wicketeer.modelfactory.internal;

/**
 * This invocation is thrown while trying to proxy an object of an unproxeable
 * (final) class.
 * 
 * @author Mario Fusco
 */
public class UnproxableClassException extends RuntimeException {

    private static final long serialVersionUID = 1L;

    UnproxableClassException(Class<?> clazz) {
        super("Unable to proxy the final class " + clazz.getName());
    }
}
