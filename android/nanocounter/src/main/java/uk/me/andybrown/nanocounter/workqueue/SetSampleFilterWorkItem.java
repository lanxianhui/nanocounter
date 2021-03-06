// This file is a part of the firmware supplied with Andy's Workshop Frequency Counter
// Copyright (c) 2016 Andy Brown <www.andybrown.me.uk>
// Please see website for licensing terms.

package uk.me.andybrown.nanocounter.workqueue;

import uk.me.andybrown.nanocounter.BluetoothService;
import uk.me.andybrown.nanocounter.FilterBandwidth;
import uk.me.andybrown.nanocounter.commands.SetSampleFilterCommand;

/*
 * Set the reference filter bandwidth
 */

public class SetSampleFilterWorkItem extends CommandWorkItem {

  /*
   * The new bandwidth
   */

  protected final FilterBandwidth _filter;


  /*
   * Constructor
   */

  public SetSampleFilterWorkItem(BluetoothService service,FilterBandwidth filter) {
    super(service);
    _filter=filter;
  }


  /*
   * Do the actual work
   */

  @Override
  public void doWork() throws Exception {
    sendCommand(new SetSampleFilterCommand(_filter));
  }
}
