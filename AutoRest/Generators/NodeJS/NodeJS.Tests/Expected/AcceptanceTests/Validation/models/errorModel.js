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
 * Initializes a new instance of the ErrorModel class.
 * @constructor
 * @member {number} [code]
 * 
 * @member {string} [message]
 * 
 * @member {string} [fields]
 * 
 */
function ErrorModel(parameters) {
  if (parameters !== null && parameters !== undefined) {
    if (parameters.code !== null && parameters.code !== undefined) {
      this.code = parameters.code;
    }
    if (parameters.message !== null && parameters.message !== undefined) {
      this.message = parameters.message;
    }
    if (parameters.fields !== null && parameters.fields !== undefined) {
      this.fields = parameters.fields;
    }
  }    
}


/**
 * Validate the payload against the ErrorModel schema
 *
 * @param {JSON} payload
 *
 */
ErrorModel.prototype.serialize = function () {
  var payload = {};
  if (this['code'] !== null && this['code'] !== undefined) {
    if (typeof this['code'] !== 'number') {
      throw new Error('this[\'code\'] must be of type number.');
    }
    payload['code'] = this['code'];
  }

  if (this['message'] !== null && this['message'] !== undefined) {
    if (typeof this['message'].valueOf() !== 'string') {
      throw new Error('this[\'message\'] must be of type string.');
    }
    payload['message'] = this['message'];
  }

  if (this['fields'] !== null && this['fields'] !== undefined) {
    if (typeof this['fields'].valueOf() !== 'string') {
      throw new Error('this[\'fields\'] must be of type string.');
    }
    payload['fields'] = this['fields'];
  }
};

/**
 * Deserialize the instance to ErrorModel schema
 *
 * @param {JSON} instance
 *
 */
ErrorModel.prototype.deserialize = function (instance) {
  if (instance) {
    if (instance.code !== null && instance.code !== undefined) {
      this.code = instance.code;
    }

    if (instance.message !== null && instance.message !== undefined) {
      this.message = instance.message;
    }

    if (instance.fields !== null && instance.fields !== undefined) {
      this.fields = instance.fields;
    }
  }
};

module.exports = ErrorModel;
