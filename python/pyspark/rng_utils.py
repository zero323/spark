#
# Licensed to the Apache Software Foundation (ASF) under one or more
# contributor license agreements.  See the NOTICE file distributed with
# this work for additional information regarding copyright ownership.
# The ASF licenses this file to You under the Apache License, Version 2.0
# (the "License"); you may not use this file except in compliance with
# the License.  You may obtain a copy of the License at
#
#    http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.
#

import os
import binascii
import random as random_rng

try:
    from numpy import random as numpy_rng
except ImportError:
    numpy_rng = None


RNGS = {
    "INIT_RANDOM_RNG": random_rng,
    "INIT_NUMPY_RNG": numpy_rng
}


def init_rngs():
    try:
        for rng in RNGS:
            if RNGS[rng] and os.environ.get(rng) == "true":
                RNGS[rng].seed(int(binascii.hexlify(os.urandom(4)), 16))
    except NotImplementedError:
        Warning("Requested RNG initialization but OS doesn't provide"
                "a randomness source.")




