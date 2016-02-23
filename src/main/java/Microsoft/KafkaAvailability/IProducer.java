//*********************************************************
// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See LICENSE file in the project root for full license information.
//*********************************************************

package Microsoft.KafkaAvailability;

public interface IProducer
{
    void SendCanaryToTopicPartition(String topicName, String partitionId);
}
