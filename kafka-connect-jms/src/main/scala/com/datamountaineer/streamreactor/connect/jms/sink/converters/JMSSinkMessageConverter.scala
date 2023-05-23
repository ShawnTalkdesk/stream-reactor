/*
 * Copyright 2017-2023 Lenses.io Ltd
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
package com.datamountaineer.streamreactor.connect.jms.sink.converters

import com.datamountaineer.streamreactor.connect.jms.config.JMSSetting
import com.datamountaineer.streamreactor.connect.jms.converters.JMSMessageConverter
import org.apache.kafka.connect.sink.SinkRecord

import javax.jms.Message
import javax.jms.Session

trait JMSSinkMessageConverter extends JMSMessageConverter {

  def convert(record: SinkRecord, session: Session, setting: JMSSetting): (String, Message)
}