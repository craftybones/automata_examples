[{
  :name "odd number of zeroes"
  :type "dfa"
  :tuple {
          :states #{:q1 :q2}
          :alphabets #{0 1}
          :delta {:q1 {0 :q2 1 :q1} :q2 {0 :q1 1 :q2}}
          :start-state :q1
          :final-states #{:q2}
          }
  :pass-cases ["0"
               "000"
               "00000"
               "10"
               "101010"
               "010101"]
  :fail-cases ["00"
               "0000"
               "1001"
               "1010"
               "001100"]
  }
 {
  :name "even number of zeroes"
  :type "dfa"
  :tuple {
          :states #{:q1 :q2}
          :alphabets #{0 1}
          :delta {:q1 {1 :q2 0 :q1} :q2 {1 :q1 0 :q2}}
          :start-state :q1
          :final-states #{:q1}
          }
  :fail-cases ["0"
               "000"
               "00000"
               "10"
               "101010"
               "010101"]
  :pass-cases ["00"
               "0000"
               "1001"
               "1010"
               "001100"]
  }
 {
  :name "at least one zero"
  :type "dfa"
  :tuple {
          :states #{:q1 :q2}
          :alphabets #{0 1}
          :delta {:q1 {0 :q2 1 :q1} :q2 {0 :q2 1 :q2}}
          :start-state :q1
          :final-states #{:q2}
          }
  :pass-cases ["0"
               "10"
               "100"
               "1100"
               "01"
               "010"]
  :fail-cases [""
               "1"
               "11"
               "111"]
  }
 {
  :name "at least one one"
  :type "dfa"
  :tuple {
          :states #{:q1 :q2}
          :alphabets #{0 1}
          :delta {:q1 {1 :q2 0 :q1} :q2 {0 :q2 1 :q2}}
          :start-state :q1
          :final-states #{:q2}
          }
  :pass-cases ["1"
               "10"
               "100"
               "1100"
               "01"
               "010"]
  :fail-cases [""
               "0"
               "00"
               "000"]
  }
 {
  :name "string length multiple of three"
  :type "dfa"
  :tuple {
          :states #{:q1 :q2 :q3}
          :alphabets #{0 1}
          :delta {:q1 {0 :q2 1 :q2}
                  :q2 {0 :q3 1 :q3}
                  :q3 {0 :q1 1 :q1}}
          :start-state :q1
          :final-states #{:q3}
          }
  :pass-cases ["000"
               "111"
               "010"
               "101"
               "111111"
               "000000"
               "101010"
               "010101"]
  :fail-cases ["00"
               "11"
               "10"
               "01"
               "11111"
               "00000"
               "01010"
               "10101"]
  }
 {
  :name "alternate ones and zeroes beginning with zero"
  :type "dfa"
  :tuple {
          :states #{:q1 :q2 :q3 :q4}
          :alphabets #{0 1}
          :delta {:q1 {0 :q2 1 :q4}
                  :q2 {0 :q4 1 :q3}
                  :q3 {0 :q2 1 :q4}
                  :q4 {0 :q4 1 :q4}}
          :start-state :q1
          :final-states #{:q2 :q3}
          }
  :pass-cases ["0"
               "01"
               "010"
               "0101"
               "01010"
               "010101"]
  :fail-cases [""
               "1"
               "10"
               "101"
               "11"
               "00"
               "0100"
               "011"]
  }


 ]