/*
 * CoreCollection.java
 * 
 * Copyright (c) 2010, Ralf Biedert All rights reserved.
 * 
 * Redistribution and use in source and binary forms, with or without modification, are
 * permitted provided that the following conditions are met:
 * 
 * Redistributions of source code must retain the above copyright notice, this list of
 * conditions and the following disclaimer. Redistributions in binary form must reproduce the
 * above copyright notice, this list of conditions and the following disclaimer in the
 * documentation and/or other materials provided with the distribution.
 * 
 * Neither the name of the author nor the names of its contributors may be used to endorse or
 * promote products derived from this software without specific prior written permission.
 * 
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS
 * OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF
 * MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE
 * COPYRIGHT OWNER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL,
 * EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION)
 * HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR
 * TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE,
 * EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 * 
 */
package sandbox.oldversions.net.jcores.v1.cores;

import java.util.Collection;

import net.jcores.jre.interfaces.functions.F0;
import net.jcores.jre.interfaces.functions.F1;
import net.jcores.jre.options.Option;
import sandbox.oldversions.net.jcores.v1.Core;

public class CoreCollection<T> extends CoreObject<Collection<T>> {

    public void hasNull() {
        // TODO Auto-generated method stub
        
    }

    /*
     * sollte was vom richtigen typ für das jeweilige objekt zurückliefern ...
     * 
     */
    public <T extends Core> T each(Class<T> handler) {
        return null;
    }

    /**
     * @return
     */
    public  Collection<T> each() {
        return get();
    }


    /**
     * Inefficient, but we should provide it ...
     * 
     * @param i
     * @return
     */
    public T get(int i) {
        return null;
    }
    
    
    /**
     * @param function
     */
    public Collection<T> map(F1<T, T> function, Option... options) {
        return null;
    }
    
    public void ifAll(F0 f0) {
        // 
    }
    
    public boolean hasAll() {
        return true;
    }

    public void filter(F1<T, Boolean> function, Option... options) {
        //
    }

}
