/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 * 
 * Code generated by Microsoft (R) AutoRest Code Generator 0.11.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * @class
 * Initializes a new instance of the ByteWrapper class.
 * @constructor
 * @member {buffer} [field]
 * 
 */
function ByteWrapper(parameters) {
  if (parameters !== null && parameters !== undefined) {
    if (parameters.field !== null && parameters.field !== undefined) {
      this.field = parameters.field;
    }
  }    
}


/**
 * Validate the payload against the ByteWrapper schema
 *
 * @param {JSON} payload
 *
 */
ByteWrapper.prototype.serialize = function () {
  var payload = {};
  if (this['field']) {
    if (!Buffer.isBuffer(this['field'])) {
      throw new Error('this[\'field\'] must be of type buffer.');
    }
    payload['field'] = this['field'].toString('base64');
  }
};

/**
 * Deserialize the instance to ByteWrapper schema
 *
 * @param {JSON} instance
 *
 */
ByteWrapper.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance.field !== null && instance.field !== undefined && typeof instance.field.valueOf() === 'string') {
      this.field = new Buffer(instance.field, 'base64');
    }
  }
};

module.exports = ByteWrapper;
